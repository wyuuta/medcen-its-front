package com.example.yuuta.medcen;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<String> namaPoli;
    private ArrayList<String> deskripsi;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        populate();
    }

    private void populate(){
        namaPoli = new ArrayList<String>();
        namaPoli.add("Poli Umum");
        namaPoli.add("Poli Gigi");
        namaPoli.add("Poli Psikologi");
        namaPoli.add("Estetiderma");
        namaPoli.add("Balai Kesehatan Ibu dan Anak (BKIA)");
        namaPoli.add("UGD");

        deskripsi = new ArrayList<String>();
        deskripsi.add("Memberikan pelayanan kepada pasien untuk konsultasi serta pemeriksaan fisik oleh dokter umum. Ditangani oleh dokter-dokter yang siap menangani keluhan awal anda dan dapat mengarahkan penanganan spesialistik lebih lanjut secara tepat.\n\nSenin s/d Kamis: 08.00-21.00 WIB\nJumat: 08.00-20.30 WIB\n");
        deskripsi.add("Memberikan pelayanan medis yang berhubungan dengan gigi. Dalam kasus ini, dokter yang menangani khusus dokter gigi.\n\nSenin s/d Kamis: 08.00-16.00 WIB\nJumat: 08.00-15.30 WIB\n");
        deskripsi.add("Memberikan pelayanan yang berhubungan dengan kondisi psikis seseorang.\n\nSenin s/d Kamis: 08.00-16.00 WIB\nJumat: 08.00-15.30 WIB\n");
        deskripsi.add("Memberikan pelayanan perawatan kecantikan terutama bagian wajah.\nJenis perawatan:\n - Facial Care\n - Facial Treatment\n - Facial Rejuvenation\n\nSenin s/d Kamis: 08.00-16.00 WIB\nJumat: 08.00-15.30 WIB\n");
        deskripsi.add("Memberikan pelayanan medis yang berhubungan dengan segala hal terkait kesehatan ibu dan anak.\n\nSenin s/d Kamis: 08.00-16.00 WIB\nJumat: 08.00-15.30 WIB\n");
        deskripsi.add("Memberikan pelayanan medis yang bersifat emergency kepada masyarakat yang membutuhkan pertolongan pertama (darurat).\n");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ListView listView = (ListView) view.findViewById(R.id.poli_list);
        listView.setAdapter(new PoliAdapter(getActivity(),namaPoli, deskripsi));

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
