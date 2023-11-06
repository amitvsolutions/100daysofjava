package com.java.week01;

public class Day005 {
	public static void main(String[] args) {
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
                "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", 
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", 
                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
                
        int random1 = (int) (Math.random() * wordListOne.length);
        int random2 = (int) (Math.random() * wordListTwo.length);
        int random3 = (int) (Math.random() * wordListThree.length);
        
        String phrase = wordListOne[random1] + " " +wordListTwo[random2] + " " + wordListThree[random3];
        System.out.println(phrase);
	}
}
