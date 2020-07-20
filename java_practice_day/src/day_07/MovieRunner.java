package day_07;

/*
 2. Create another class: MovieRunner and do the followings
Create main method
Create 3 Movie objects and assign values of your choice. 
Example:
Move name=starWars
duration=120
isGood=true
And print the movie info
 */
public class MovieRunner extends Movie {

	public static void main(String[] args) {
		MovieRunner starWars=new MovieRunner();
        //Assigning name
        starWars.setName("Star Wars");
        //Assigning duration
        starWars.duration=120;
        //Assigning is good or not
        starWars.isGood=true;
        //Calling movieInfo method to pring movie information faster
        starWars.movieInfo();
        //Print if movie short or long
        starWars.shortOrLong();

	}

}
