package tutorial.learnpreferencescreen.ver1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tutorial.learnpreferencescreen.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link(https://stackoverflow.com/questions/39200846/how-to-add-toolbar-in-preferenceactivity)
 */

public class PrefsActivityVer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefs_ver2);
        getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new UserPreferenceFragment()).commit();
    }

}