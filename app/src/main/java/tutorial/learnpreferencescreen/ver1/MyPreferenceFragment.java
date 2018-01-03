package tutorial.learnpreferencescreen.ver1;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import tutorial.learnpreferencescreen.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link()
 */

public class MyPreferenceFragment extends PreferenceFragment {

    public MyPreferenceFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }

}
