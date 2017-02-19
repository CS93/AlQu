/**
 * @author Carsten Schlender
 */
 
package de.schlender.carsten.alqu.Naviation;

import android.app.Activity;
import android.content.Intent;

import de.schlender.carsten.alqu.data.Constants;

public class Navigation {
	
	private static final Class<?> 	ACTIVITY_CHOOSE_CATEGORY_CLASS = de.schlender.carsten.alqu.chooseCategory.Init.class;

	public static void startActivityChooseCategory(Activity callingActivity){
		startActivity(callingActivity, ACTIVITY_CHOOSE_CATEGORY_CLASS);
		
	}

	private static void startActivity(Activity callingActivity,
									  Class <?> classOfActivityToStart){
		Intent intent;

		intent = new Intent();
		intent.setClass(callingActivity, classOfActivityToStart);
		callingActivity.startActivity(intent);
	}

	/* //Example for Start activity with Parameter
	public static void startActivityUserMenu(Activity callingActivity, User user){
		startActivityWithParam(callingActivity, ACTIVITY_USER_MENU_CLASS, Constants.KEY_PAR_CURRENT_USER_VALUE, user);		
	}	



	//Example for Start Activity with several Parameters
	public static void startActivityChallenge(Activity callingActivity, User user, String category) {
		startActivityWithTwoStringParams(callingActivity, ACTIVITY_CHALLENGE_CLASS, Constants.KEY_PAR_CURRENT_USER_VALUE, user, Constants.KEY_PAR_CURRENT_CATEGORY_VALUE, category);
	}

	//Example for Start Activity for Result
	public static void startActivitySolution(Activity callingActivity, boolean[] userCheckboxAnswers, Challenge currentChallenge, String userTextAnswer) {		
		startActivitySolutionForResult(callingActivity, ACTIVITY_SOLUTION_CLASS, Constants.KEY_USER_ANSWERS_CHECKBOXES, userCheckboxAnswers, Constants.KEY_CURRENT_CHALLENGE_VALUE, currentChallenge, userTextAnswer);
	}


	//This mehtod is called when a new activity is called and a user should be given to the new activity through intent
	private static void startActivityWithParam(Activity callingActivity,
			Class <?> classOfActivityToStart,
			String key, User user){
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key, user);	
		intent.setClass(callingActivity, classOfActivityToStart);		
		callingActivity.startActivity(intent);
	}
	
	private static void startActivityWithTwoStringParams(Activity callingActivity, Class<?> classOfActivityToStart,
			String key1, User user, String key2, String category) {
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key1, user);
		intent.putExtra(key2, category);
		intent.setClass(callingActivity, classOfActivityToStart);		
		callingActivity.startActivity(intent);
	}
	
	
	private static void startActivityWithFourIntParams(Activity callingActivity, Class<?> classOfActivityToStart,
			String key1, int indexOfCurrentChallenge, String key2, int numberOfDueChallenges, String key3, int numberOfCorrectAnswers, String key4, int numberOfWrongAnswers) {
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key1, indexOfCurrentChallenge);
		intent.putExtra(key2, numberOfDueChallenges);
		intent.putExtra(key3, numberOfCorrectAnswers);
		intent.putExtra(key4, numberOfWrongAnswers);
		intent.setClass(callingActivity, classOfActivityToStart);		
		callingActivity.startActivity(intent);
	}
	
	
	
	private static void startActivitySolutionForResult(Activity callingActivity, Class<?> classOfActivityToStart, String keyCheckBoxex, boolean[] userCheckboxAnswers, String keyChallenge, Challenge currentChallenge, String userTextAnswer){
		Intent intent;
		
		intent = new Intent();
		intent.setClass(callingActivity, classOfActivityToStart);
		intent.putExtra(keyCheckBoxex, userCheckboxAnswers);	
		//if you want to put an object of a new class in intent, the class (in this case the class challenge) needs to implement Serializable
		intent.putExtra(keyChallenge, currentChallenge);
		intent.putExtra(Constants.KEY_USER_ANSWER_TEXT, userTextAnswer);
		callingActivity.startActivityForResult(intent, Constants.REQUESTCODE_ACTIVITY_SOLUTIONS);
	}
	
	public static void setActivitySolutionReturnValues(Activity returningActivity, boolean userAnswerCorrect) {
		setActivityReturnValues(returningActivity, Constants.KEY_RETURN_CHALLENGE_ANSWER_BOOL, userAnswerCorrect);
	}
	
	private static void setActivityReturnValues(Activity returningActivity,
			String key, boolean value) {
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key, value);
		returningActivity.setResult(Activity.RESULT_OK, intent);		
	}
	*/
}
