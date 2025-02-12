package com.example.textbasedadventure;

import com.example.textbasedadventure.Classes.StoryOption;

public class StorySetup {
    public static StoryOption startNode = new StoryOption();
    public StorySetup(){
        startNode.optionTitle = "Journey's start";
        startNode.optionText = "this is the start of the story";

        StoryOption badEndOption = new StoryOption("text 1", "you died");


        StoryOption option1 = new StoryOption("click this one", "option 1");
        StoryOption option2 = new StoryOption("text 2", "this is option 2");
        StoryOption option3 = new StoryOption("text 3", "this is option 3");


        startNode.nextOptions.add(option1);
        startNode.nextOptions.add(option2);
        startNode.nextOptions.add(option3);




        StoryOption option4 = new StoryOption("text 4", "this is option 4");
        StoryOption option5 = new StoryOption("click this one", "dialog 5");

        option1.nextOptions.add(option4);
        option1.nextOptions.add(option5);
        option2.nextOptions.add(badEndOption);
        option3.nextOptions.add(badEndOption);
        option4.nextOptions.add(startNode);



        StoryOption option6 = new StoryOption("click me", "This is the end of this demo");

        option5.nextOptions.add(option6);
    }
}
