package tutorial.learnpreferencescreen.ver2;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import tutorial.learnpreferencescreen.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link()
 */

public class SettingPreference extends PreferenceFragmentCompat {

    public static final String FRAGMENT_TAG = "my_preference_fragment";

    @Override
    public void onCreatePreferences(Bundle bundle, String rootkey) {
        setPreferencesFromResource(R.xml.preferences, rootkey);
    }
}
