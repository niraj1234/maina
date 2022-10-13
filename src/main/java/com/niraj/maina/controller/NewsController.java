package com.niraj.maina.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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

}
