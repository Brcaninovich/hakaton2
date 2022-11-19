package com.brcaninovich.hakaton2;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class UserDataFetch {

    static FirebaseAuth mAuth = FirebaseAuth.getInstance();
    static FirebaseUser mUser = mAuth.getCurrentUser();

    static String email = mUser.getEmail();

    public static String ime_prezime;
    public static List<String> predmeti_ocjene = new ArrayList<>();
    public static List<String> raspored_casova = new ArrayList<>();
    public static String izostanci_opravdani;
    public static String izostanci_neopravdani;
    public static String vladanje;
    Integer broj = UserDataFetch.raspored_casova.size();

    private static FirebaseFirestore db = FirebaseFirestore.getInstance();
    private static DocumentReference ucenik = db.collection("Ucenik").document(email);

    public static void fetcData2(){
        ucenik.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if(documentSnapshot.exists()){
                    ime_prezime = documentSnapshot.getString("Ime_Prezime");
                    izostanci_opravdani = documentSnapshot.getString("Izostanci_Opravdani");
                    izostanci_neopravdani = documentSnapshot.getString("Izostanci_nepravdani");
                    vladanje = documentSnapshot.getString("vladanje");
                    if (documentSnapshot.exists()) {
                        predmeti_ocjene = (List<String>) documentSnapshot.get("Predmeti_Ocjene");
                        raspored_casova = (List<String>) documentSnapshot.get("Raspored_Casova");
                }else{
                        //PROBA
                    }


                    Integer broj = raspored_casova.size();
                   Log.d("Probaa", "Proba");
                    //Log.d("Probaa", predmeti_ocjene.get(1));
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

}
