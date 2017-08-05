package fyp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fyp.entities.Employee;
import fyp.entities.Site;
import fyp.entities.TimesheetEntry;
import fyp.entities.UserGroup;
import fyp.services.EmployeeService;
import fyp.services.SiteService;
import fyp.services.TimesheetEntryService;
import fyp.services.UserGroupService;

@RestController
@RequestMapping("/api")
public class RESTController implements RESTInterface {
	
	@Autowired
	private TimesheetEntryService timesheetEntryService;
	
	@Autowired
	private SiteService siteService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private UserGroupService userGroupService;
	
	
	@RequestMapping(
			value="/TimesheetEntry", 
			method = RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TimesheetEntry  addTimesheetEntry(
			@RequestBody TimesheetEntry timesheetEntry
		) {
		
		//siteService.save(timesheetEntry.getSite());
		return timesheetEntryService.save(timesheetEntry);
	}
	
	@RequestMapping(
			value="/TimesheetEntry/{timesheetID}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TimesheetEntry  getTimesheetEntry(
			@PathVariable("timesheetID") Integer timesheetID
		) {
		
		return timesheetEntryService.findOne(timesheetID); //new db method
	}	
	
	@RequestMapping(
			value="/Site", 
			method = RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Site  addSite(
			@RequestBody Site site
		) throws Exception {
		
		try
		{
			return siteService.save(site);
		}
		catch (Exception e )
		{
			throw new Exception("Site already exists.");
		}
	}
	
	@RequestMapping(
			value="/Employee", 
			method = RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Employee addEmployee(@RequestBody Employee employee ) throws Exception {
		
		try
		{
			return employeeService.save(employee);
		}
		catch (Exception e )
		{
			throw new Exception("Employee already exists.");
		}
	}
	
	@RequestMapping(
			value="/UserGroup", 
			method = RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserGroup  addUserGroup(
			@RequestBody UserGroup userGroup
		) throws Exception {
		
		try
		{
			return userGroupService.save(userGroup);
		}
		catch (Exception e )
		{
			throw new Exception("User Group already exists.");
		}
	}
	
	@RequestMapping(
			value="/Site/{siteID}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Site  getSite(
			@PathVariable("siteID") Integer siteID
		) {
		
		return siteService.findOne(siteID);
	}
	
	@RequestMapping(
			value="/Site/all", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Site> getAllSites() {
		
		return siteService.findAll();
	}
}
