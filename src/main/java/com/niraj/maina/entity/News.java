package com.niraj.maina.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
	

	private int newsId;
	private String newsHeadline;
	private String category;
	private String author;
	private String city;

	
}
