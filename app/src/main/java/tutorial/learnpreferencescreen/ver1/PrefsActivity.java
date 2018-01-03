package tutorial.learnpreferencescreen.ver1;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import tutorial.learnpreferencescreen.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link(https://developer.android.com/reference/android/preference/PreferenceActivity.html)
 *
 * @link(https://stackoverflow.com/questions/39200846/how-to-add-toolbar-in-preferenceactivity)
 * If you want to add more toolbars
 *
 */

public class PrefsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
