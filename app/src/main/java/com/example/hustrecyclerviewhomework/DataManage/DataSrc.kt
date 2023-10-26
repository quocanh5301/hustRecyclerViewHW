package com.example.hustrecyclerviewhomework.DataManage

import com.example.hustrecyclerviewhomework.Models.Affirmation
import com.example.hustrecyclerviewhomework.R

class DataSrc {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.strong),
            Affirmation(R.string.affirmation2, R.drawable.trust),
            Affirmation(R.string.affirmation3, R.drawable.grow),
            Affirmation(R.string.affirmation4, R.drawable.opportunity),
            Affirmation(R.string.affirmation5, R.drawable.grateful),
            Affirmation(R.string.affirmation6, R.drawable.gift),
            Affirmation(R.string.affirmation7, R.drawable.sunrise),
            Affirmation(R.string.affirmation8, R.drawable.heart),
            Affirmation(R.string.affirmation9, R.drawable.unfold),
            Affirmation(R.string.affirmation10, R.drawable.confident)
        )
    }
}