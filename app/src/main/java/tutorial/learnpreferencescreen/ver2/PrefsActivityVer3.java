package tutorial.learnpreferencescreen.ver2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;

import tutorial.learnpreferencescreen.R;

/**
 * Created by lorence on 03/01/2018.
 *
 * @link()
 */

public class PrefsActivityVer3 extends AppCompatActivity implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefs_ver3);
        if (savedInstanceState == null) {
            // Create the fragment only when the activity is created for the first time.
            // ie. not after orientation changes
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(SettingPreference.FRAGMENT_TAG);
            if (fragment == null) {
                fragment = new SettingPreference();
            }

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment, SettingPreference.FRAGMENT_TAG);
            ft.commit();
        }
    }

    @Override
    public boolean onPreferenceStartFragment(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        SettingPreference fragment = new SettingPreference();
        Bundle args = new Bundle();
        args.putString(PreferenceFragmentCompat.ARG_PREFERENCE_ROOT, preference.getKey());
        fragment.setArguments(args);
        ft.replace(R.id.fragment_container, fragment, preference.getKey());
        ft.addToBackStack(preference.getKey());
        ft.commit();
        return true;
    }
}
