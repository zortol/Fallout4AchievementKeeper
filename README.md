# Fallout4AchievementKeeper
Checks the remaining achievements you need for fallout 4
Features:

        - Writes into a text file which achievements you need.
        - Enables you to add the achievement that you just completed into the your (need/have) achievement files (But becareful, if you are just testing the addAchievement() method REMEMBER to remove the achievement name that you input when you are using it for real.)

Once we have the following files we can proceed to start the program:


    1. AchievementYouHave.txt (achievement names that you have)
    2. Fallout4Achievements.txt (achievement names that is in the game) (Provided)
In order to extract what achievements you have:
    
    1. Manually Type it on a notepad
    
    2. Head to Steam -> Goto Library -> Fallout 4 Menu -> Click on "View My Achievements" -> Right click & Click on "View Source.."

Continuing on 2.
    
    Method ( readTheAchievementsIHave() ):
    Extract the names of the achievements into a notepad, from the console, and save another one as a back-up
    -------------------------------------------------------------------------------------------------------------------------------------
    WARNING: In the "if" statement of this method, remember that the 29 hidden achievements part, the 29 is dependent on what number of achievements you have.
    I mean i dont think its a big deal, as you are just copying the achievement names from the console, but if you want it to look nice and the counter providing the correct no of achievements then go ahead and change the number.
    -------------------------------------------------------------------------------------------------------------------------------------
    Findings:
        -I realised that most of the achievements names that i had was under html tag h3 and so i looked for lines that contained that.
        -It was also weird that there were spaces so i had to split them.

Moving on.. 

    under the main method, I have stated in the comments on how to insert the achievements you have just completed.
    REMEMBER:
    
      The order of the methods are important!!
      1. addAchievement(optional)
      2. readerForMe()
      3. readerForAllAch()
      4. writer()
