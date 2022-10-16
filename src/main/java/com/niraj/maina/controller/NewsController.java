package com.niraj.maina.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niraj.maina.entity.News;

@RestController
public class NewsController {

	@GetMapping("/news")
	public List<News> getAllNews(){
		News n1 = new News(1 , "Russia attacks after Crimea bridge bombing", "Political", "Niraj Thakur", "Kiyv");
		News n2 = new News(2 , "Petrol Price again increases", "Business", "Shweta Bhargav", "New Delhi");
		News n3 = new News(3 , "Byjus fires 2500 employee in fresh restructure", "Business", "Raju Srimant", "Bangalore");
		News n4 = new News(4 , "Nitish mocks Modi for J P Andolan and Freedom Movement ", "Political", "Gaurav Pal", "Patna");
		News n5 = new News(5 , "Australia beats England in 3rd T20 at Melbourne", "Sports", "Niraj Thakur", "New Delhi");
		List<News>  newsList = new ArrayList<News>();
		newsList.add(n5);
		newsList.add(n4);
		newsList.add(n3);
		newsList.add(n2);
		newsList.add(n1);		
		return newsList;
	}

	
	@RequestMapping(value="/site" , method= RequestMethod.GET)
	public String getPublicationName() {
        String siteName = "" ;

		ArrayList publicationList = new ArrayList<String>();
		publicationList.add("www.patnaInfo.com");
		publicationList.add("www.hindustanTimes.com");
		publicationList.add("www.khojo.online");
		publicationList.add("www.newsdekho.in");
		publicationList.add("www.kauwa.online");
		publicationList.add("www.work1.com");
				
		Random rand = new Random();
		int upperlimit = 5;
		int randNum = rand.nextInt(upperlimit);		
		siteName = (String) publicationList.get(randNum);
        
		return siteName;
	}

	@GetMapping("/site/{t}")
	public String newsType(@PathVariable("t") String type) {
		System.out.println("News Type in Request ==> " + type);
		return "News Type "+ type;
	}

}
