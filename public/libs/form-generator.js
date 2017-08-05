class FormGenerator
{
	constructor( schemaEndpoint ) 
	{	
		if ( !schemaEndpoint || !/^https?:\/\//i.test( schemaEndpoint ) ) 
		{		
			throw new Error('FormGenerator error: The REST endpoint must start with http:// or https://');
		}

		this.schemaEndpoint = schemaEndpoint.replace(/\/+$/, '');
	}

	render( entityClassName, formContainerID, preData, msgs )
	{
		var thisC = this;
		// fetches the entity JSON schema in order to generate the form automatically
		$.get( this.schemaEndpoint +'/'+ entityClassName, function( schemaObj ) 
		{
			var BrutusinForms = brutusin["json-forms"];
			var bf = BrutusinForms.create(schemaObj);
				bf.render( document.getElementById(formContainerID), preData );

			$('#formSubmit').on('click', function(e){
				var formData = bf.getData();
				if ( typeof formData != "object" || formData == null )
				{
					alert( 'Please fill in at least one field first!' );
					return false;
				}

				if ( !bf.validate() )
				{
					return;				
				}

				$.ajax({
				    type: 'POST',
				    url: '/api/'+ entityClassName,
				    data: JSON.stringify(formData),
				    //data: formData,
				    dataType: "json",
				    contentType: "application/json; charset=utf-8",
				    cache: false,
				    processData:false,
				    success: function(result) {
				    	$('#'+ formContainerID).html( '' );
				        bf.render( document.getElementById(formContainerID), {} );
				        alert( "Entity saved to the DB!" );
				    },
				    error: function(jqXHR) {
				    	var json = jqXHR.responseJSON;
				        alert( json.message );
				    }
				});

			});
			
		});
	}
	
	listItems( elObj, entity) 
	{
		// listItems
	}
}
