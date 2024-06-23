/**
 * 
 */
package com.viewdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class ViewController {
	
	@GetMapping("/greet/{name}")
	 String show(@PathVariable String name) {
	    return "Vanakkam "+name +" !!! :)";
	 }

}
