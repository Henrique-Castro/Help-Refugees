package fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import domain.helprefugees.R;

public class FragmentPrincipal extends Fragment {

        public FragmentPrincipal() {
            // Required empty public constructor
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_tela_principal, container, false);
            return v;
        }

    }

