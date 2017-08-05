require([
	'libs/text!header.html', 
	'libs/text!home.html', 
	'libs/text!footer.html'
	], 
	function (
		headerTpl, 
		homeTpl, 
		footerTpl
	) {
	
	var ApplicationRouter = Backbone.Router.extend({
		routes: {
			"": "home",
			//"*actions": "home",
			"site/add": "siteForm",
			"site/edit/:id": "siteForm",
			"employee/add": "employeeForm",
			"employee/edit/:id": "employeeForm",
			"usergroup/add": "usergroupForm",
			"usergroup/edit/:id": "usergroupForm",
			"timesheetentry/add": "timesheetentryForm",
			"timesheetentry/edit/:id": "timesheetentryForm"
		},
		initialize: function() {
			this.headerView = new HeaderView();
			this.headerView.render();
			this.footerView = new FooterView();
			this.footerView.render();
		},
		home: function() {
			this.homeView = new HomeView();
			this.homeView.render();
		},
		//form link
		siteForm: function() {
			this.siteFormView = new SiteFormView();
			this.siteFormView.render();
		},
		employeeForm: function() {
			this.employeeFormView = new EmployeeFormView();
			this.employeeFormView.render();
		},
		usergroupForm: function() {
			this.usergroupFormView = new UserGroupFormView();
			this.usergroupFormView.render();
		},
		timesheetentryForm: function() {
			this.timesheetentryFormView = new TimesheetEntryFormView();
			this.timesheetentryFormView.render();
		}
		
	});
	//renders forms from entity
	HeaderView = Backbone.View.extend({
		el: "#header",
		templateFileName: "header.html",
		template: headerTpl,
		initialize: function() {
			// $.get(this.templateFileName, function(data){console.log(data);this.template=data});		
		},
		render: function() {
			$(this.el).html(_.template(this.template));
		}
	});

	FooterView = Backbone.View.extend({
		el: "#footer",
		template: footerTpl,
		render: function() {
			this.$el.html(_.template(this.template));
		}
	})
	HomeView = Backbone.View.extend({
		el: "#content",
		// template: "home.html",
		template: homeTpl,
		initialize: function() {

		},
		render: function() {
			$(this.el).html(_.template(this.template));
		}
	});
	
	SiteFormView = Backbone.View.extend({
		el: "#content",
		templateFileName: "/templates/siteForm.html",
		initialize: function() {
		},
		render: function() {
			var _this = this;
			$.get( this.templateFileName, function(data){
				_this.template=data;
				$(_this.el).html(_.template(_this.template));
			});
		}
	});
	
	EmployeeFormView = Backbone.View.extend({
		el: "#content",
		templateFileName: "/templates/employeeForm.html",
		initialize: function() {
		},
		render: function() {
			var _this = this;
			$.get( this.templateFileName, function(data){
				_this.template=data;
				$(_this.el).html(_.template(_this.template));
			});
		}
	}); 
	
	UserGroupFormView = Backbone.View.extend({
		el: "#content",
		templateFileName: "/templates/usergroupForm.html",
		initialize: function() {
		},
		render: function() {
			var _this = this;
			$.get( this.templateFileName, function(data){
				_this.template=data;
				$(_this.el).html(_.template(_this.template));
			});
		}
	}); 
	
	TimesheetEntryFormView = Backbone.View.extend({
		el: "#content",
		templateFileName: "/templates/timesheetentryForm.html",
		initialize: function() {
		},
		render: function() {
			var _this = this;
			$.get( this.templateFileName, function(data){
				_this.template=data;
				$(_this.el).html(_.template(_this.template));
			});
		}
	}); 
	
	app = new ApplicationRouter();
	Backbone.history.start();	
});


