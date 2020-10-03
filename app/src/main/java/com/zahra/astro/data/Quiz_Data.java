package com.zahra.astro.data;

public class Quiz_Data {
//Atmosphere data
    public String earthQuestions[] ={
            "What is the atmosphere?",
            "What two elements make up the majority of the Earth's atmosphere?",
            "Which of the following best describes the Earth's atmosphere?",
            "What layer of the Earth's atmosphere is the outermost layer and where the atmosphere is the thinnest?",
            "What layer of the Earth's atmosphere is the layer next to the Earth?",
            "What is the ozone layer?",
            "What layer of the Earth's atmosphere has a very thin atmosphere, but can also become very hot?",
            "What layer of the Earth's atmosphere is where most meteors burn up upon entry?",
            "In what layer of the Earth's atmosphere do planes usually fly?",
            "What layer of the Earth's atmosphere is heated by the Sun hitting the ozone layer?"
    };

    public String earthChoices[][] = {
            {"It is another name for outer space","A layer of gases that surround the Earth","The first layer of the Earth's crust","All of the above"},
            {"Carbon and oxygen","Oxygen and hydrogen","Hydrogen and nitrogen","Nitrogen and oxygen"},
            {"A big blanket absorbing the Sun's heat","An empty space","A large cloud that generates the Earth's electromagnetic field","None of the above"},
            {"Exosphere" , "Mesosphere" , "Stratosphere" , "Troposphere"},
            {"Mesosphere" ,"Stratosphere" ,"Exosphere" , "Troposphere"},
            {"A portion of the Earth's atmosphere that protects the Earth from radiation" ,"The layer of the Earth below the crust" ,"The layer of the atmosphere that we breathe","All of the above"},
            {"Exosphere" ,"Thermosphere" ,"Mesosphere" , "Stratosphere"},
            {"Stratosphere" ,"Exosphere" , "Troposphere","Mesosphere"},
            {"Troposphere" ,"Mesosphere" , "Stratosphere" ,"Thermosphere"},
            {"Mesosphere" ,"Stratosphere" ,"Thermosphere" , "Troposphere"},
    };

    public String earthAnswers[] = {"A layer of gases that surround the Earth","Nitrogen and oxygen","A big blanket absorbing the Sun's heat","Exosphere",
            "Troposphere","A portion of the Earth's atmosphere that protects the Earth from radiation","Thermosphere","Mesosphere","Troposphere","Stratosphere"};



    public String getEarthQuestion(int pos){
        String question = earthQuestions[pos];
        return question;
    };
    public String getEarthChoice1(int pos){
        String choice1 = earthChoices[pos][0];
        return choice1;
    };
    public String getEarthChoice2(int pos){
        String choice2 = earthChoices[pos][1];
        return choice2;
    };
    public String getEarthChoice3(int pos){
        String choice3 = earthChoices[pos][2];
        return choice3;
    };
    public String getEarthChoice4(int pos){
        String choice4 = earthChoices[pos][3];
        return choice4;
    };
    public String getEarthAnswer(int pos){
        String answer = earthAnswers[pos];
        return answer;
    };

//Solar System data
    public String spaceQuestions[] ={
            "The Solar System is a part of what galaxy?",
            "How many planets are there in the Solar System?",
            "What celestial body is at the center of the Solar System?",
            "Jupiter, Saturn, Uranus, and Neptune are classified as what type of planets?",
            "What group of celestial objects exists at the very outer edge of the Solar System?",
            "Pluto, Ceres, and Eris are classified as what type of planets?",
            "What planet is the third planet from the Sun?",
            "What dwarf planet was once considered a full planet of the Solar System?",
            "What celestial objects orbit the Sun and often have a visible tail of gas?",
            "What group of celestial objects includes rocky objects in orbit between Mars and Jupiter?"
    };

    public String spaceChoices[][] = {
            {"Pinwheel","Whirlpool","Milky Way","Sunflower"},
            {"1","8","100","9"},
            {"A giant black hole","Earth","Jupiter","The Sun"},
            {"Gas giant planets" , "Asteroid planets" , "Comet planets" , "Dwarf planets"},
            {"Kuiper Belt" ,"Oort Cloud" ,"Comets" , "Asteroid Belt"},
            {"Gas giant planets" , "Asteroid planets" , "Comet planets" , "Dwarf planets"},
            {"Mars" ,"Jupiter" ,"Earth" , "Mercury"},
            {"Venus" ,"Ceres" , "Pluto","None of the above"},
            {"Kuiper Belt" ,"Oort Cloud" , "Asteroid Belt","Comets"},
            {"Comets","Kuiper Belt","Asteroid Belt","Oort Cloud"},
    };

    public String spaceAnswers[] = {"Milky Way","8","The Sun","Gas giant planets",
            "Oort Cloud","Dwarf planets","Earth","Pluto","Comets","Asteroid Belt"};



    public String getSpaceQuestion(int pos){
        String question = spaceQuestions[pos];
        return question;
    };
    public String getSpaceChoice1(int pos){
        String choice1 = spaceChoices[pos][0];
        return choice1;
    };
    public String getSpaceChoice2(int pos){
        String choice2 = spaceChoices[pos][1];
        return choice2;
    };
    public String getSpaceChoice3(int pos){
        String choice3 = spaceChoices[pos][2];
        return choice3;
    };
    public String getSpaceChoice4(int pos){
        String choice4 = spaceChoices[pos][3];
        return choice4;
    };
    public String getSpaceAnswer(int pos){
        String answer = spaceAnswers[pos];
        return answer;
    };
}
