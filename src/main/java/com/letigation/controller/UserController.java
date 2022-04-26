package com.letigation.controller;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.http.HttpHeaders;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.letigation.model.attorneytable;
import com.letigation.model.litigationdetails;
import com.letigation.model.litigationmaster;
import com.letigation.service.UserService;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;
@SuppressWarnings("unused")
@RestController
public class UserController {
	
	
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET,value ="/letigation1")
    public List<attorneytable> getvalues()
	{
    	return service.findAll11();
    }
    
    

	@RequestMapping(method = RequestMethod.GET,value ="/letigation2")
    public List<litigationdetails> getPosts1()
	{
    	return service.findAll2();
    }
    
    @RequestMapping(method = RequestMethod.GET,value ="/letigation")
    public List<litigationmaster> getPostsall()
	{
    	return service.findAll();
    }
   
	@RequestMapping(method=RequestMethod.POST, value = "/letigationpost")
	
	@ResponseStatus(HttpStatus.CREATED)
	public void addPost( @RequestBody  litigationmaster listElement)
	{
		
		service.insert(listElement);
		
	}
	
	
	
	
	
//   public void exportToCSV(HttpServletResponse response) throws IOException {
//        response.setContentType("text/csv");
//       
//        
//        String headerKey = "Content-Disposition";
//        String headerValue = "attachment; filename=users_" + ".csv";
//       response.setHeader(headerKey, headerValue);
//         
//       List<litigationmaster> listUsers = service.findAll();
//
//        CsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
//        String[] csvHeader = {"litigationtype", "litigationstatus", "litigationcause"};
//        String[] nameMapping = {"litigationtype", "litigationstatus", "litigationcause"};
//        
//       csvWriter.writeHeader(csvHeader);
//         
//       for (litigationmaster litigationmaster1 : listUsers) {
//            csvWriter.write(litigationmaster1, nameMapping);
//       }
//         
//       csvWriter.close();
//	}
	
	 @GetMapping("/users/export")
    public void exportToCSV(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
      
       
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + ".csv";
    
        response.setHeader(headerKey, headerValue);
        List<litigationmaster> listUsers = service.findAll();
        
      
       
 
   ICsvBeanWriter csvwiter = new CsvBeanWriter(response.getWriter(),CsvPreference.STANDARD_PREFERENCE);
        String[] csvHeader = {"address1","attorneyname", "cellphone1","city","documentname1","email1","firmname","litigationbudget1","litigationcause","litigationid","litigationstatus","litigationtype","plaintiffname","result","state1","venuecity"};
        String[] nameMapping = {"address","attorneyname", "cellphone","city","documentname","email","firmname","litigationbudget","litigationcause","litigationid","litigationstatus","litigationtype","plaintiffname","result","state","venuecity"};
         
        csvwiter.writeHeader(csvHeader);
         
        for (litigationmaster user : listUsers) {
        	csvwiter.write(user, nameMapping);
        }
         
        csvwiter.close();
         
    }
     
}


	
	
	
	
	
	
	







