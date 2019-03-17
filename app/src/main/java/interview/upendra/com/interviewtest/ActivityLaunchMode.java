package interview.upendra.com.interviewtest;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by upendra on 18/03/19.
 */

public class ActivityLaunchMode extends AppCompatActivity {

    /** SingleTop ->  If the activity will only create the instance if not
     *              already present in the top to the Stack, else create new Instance
     *              Even if activity present in somewhere middle of the stack
     *
     *
     * SingleTask-> If in the stack activity already present somewhere middle of the stack,
     *              It will kill all the activities on the Top, to remain only single activity in the task
     *              Android system will route the information throudh onNewIntent()
     *
     * Standard-> Create the number of instance how many time we will call
     *
     * SingleInstance-> If there are already some Activity in stack, it will start the Activity in different task
     *                  and will not create different instance for it, Any other Activity created from
     *                  this activity will start in new Task
     *
     *
     *                  @https://medium.com/@iammert/android-launchmode-visualized-8843fc833dbe
     *                  @https://android.jlelse.eu/android-activity-launch-mode-e0df1aa72242
     *
     */
}
