package tutorial.learnpreferencescreen.ver1;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import tutorial.learnpreferencescreen.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link(https://stackoverflow.com/questions/39200846/how-to-add-toolbar-in-preferenceactivity)
 */

public class UserPreferenceFragment extends PreferenceFragment {

    public UserPreferenceFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
