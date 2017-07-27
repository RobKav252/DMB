package fyp.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.jsondoc.core.annotation.ApiMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fyp.repo.TimesheetEntryRepository;
import fyp.services.TimesheetEntryService;
import fyp.entities.TimesheetEntry;

@RestController
public class TimesheetEntryController 
{
	@Autowired
	private TimesheetEntryService timesheetEntryService;	

    @RequestMapping(path = "/timesheetEntry", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> timesheetEntry(
    		@RequestParam(value="employeeID") Integer employeeID, 
    		@RequestParam(value="startDate") String startDate,
    		@RequestParam(value="endDate") String endDate,
    		@RequestParam(value="workDesc", required = false) String workDesc,
    		@RequestParam(value="siteID", required = false) Integer siteID
    	) {
    	
    	
    	// before we save the POJO, convert date from string to Date obj
    	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    	Date startDate_tmp = null;
    	Date endDate_tmp = null;

		// if there's a problem with the date format, throw
		// an error via REST, as a JSON string
		try {
			startDate_tmp = (Date) formatter.parse(startDate);
			endDate_tmp = (Date) formatter.parse(endDate);
		} catch (ParseException e) {
			return new ResponseEntity<Object>(new HashMap<String, String>()
			{{
				put("result", "FAIL");
				put("msg", "Sample exception message.");
			}}, HttpStatus.BAD_REQUEST);
		}

		// initialise POJO
    	TimesheetEntry entry = new TimesheetEntry(
    				employeeID, 
    				startDate_tmp, 
    				endDate_tmp, 
    				workDesc,
    				siteID);

		//save the data to DB
    	timesheetEntryService.save(entry);
    	
    	return new ResponseEntity<Object>(entry, HttpStatus.OK);
    }
}