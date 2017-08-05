package fyp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.reinert.jjschema.JsonSchemaGenerator;
import com.github.reinert.jjschema.SchemaGeneratorBuilder;
import com.github.reinert.jjschema.exception.TypeException;

import java.io.IOException;



@SuppressWarnings("deprecation")
@RestController
public class JSONSchemaController {
	
	@RequestMapping(value="/schema/{entityName}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getTimesheetEntry(@PathVariable("entityName") String entityName ) 
			throws 
			TypeException, 
			ClassNotFoundException, 
			JsonGenerationException, 
			JsonMappingException, 
			IOException {        
        // get the draft 4 schema builder
		JsonSchemaGenerator v4generator = SchemaGeneratorBuilder.draftV4HyperSchema().build();
        // use the schema builder to generate JSON schema from Java class
		ObjectNode schemaNode = v4generator.generateSchema( Class.forName("fyp.entities."+entityName) );
        
    	ObjectMapper mapper = new ObjectMapper();
    	
    	// make JSON pretty
    	mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
		return new ResponseEntity<>(mapper.writeValueAsString(schemaNode),HttpStatus.OK);
	}
}
