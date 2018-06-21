package com.infoedgellc.springmvc.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infoedgellc.springmvc.utility.YoutubePojo;
import com.infoedgellc.springmvc.utility.YoutubeUtility;
 
@RestController
public class YoutubeRestController {
 
    @Autowired
    YoutubeUtility youtubeUtility;
 
    
    //-------------------Retrieve All Youtube Links based on the query --------------------------------------------------------
     
    @RequestMapping(value = "/user/{queryTerm}", method = RequestMethod.GET)
    public ResponseEntity<List<YoutubePojo>> listAllUsers(@PathVariable("queryTerm") String queryTerm) {
      List<YoutubePojo> listYoutubePojo =  youtubeUtility.loadYoutubeData(queryTerm);
        if(listYoutubePojo.isEmpty()){
            return new ResponseEntity<List<YoutubePojo>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<YoutubePojo>>(listYoutubePojo, HttpStatus.OK);
    }
}