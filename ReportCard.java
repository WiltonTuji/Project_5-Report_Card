package com.example.android.project5_wiltontuji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;


public class ReportCard extends AppCompatActivity {

    private String mNomeAluno;
    private String[] mMaterias;
    private float[] mNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);
    }

    public void ReportCard(String nome, String m1, float n1, String m2, float n2, String m3, float n3, String m4, float n4) {
        mNomeAluno = nome;
        mMaterias = new String[]{m1, m2, m3, m4};
        mNotas = new float[]{n1, n2, n3, n4};
        Log.v("Verificar", mNomeAluno);
    }

    public void setName(String nomeAluno) {
        mNomeAluno = nomeAluno;
    }

    public String getName() {
        return (mNomeAluno);
    }

    public void setMaterias(String m1, String m2, String m3, String m4) {
        mMaterias = new String[]{m1, m2, m3, m4};
    }

    public String[] getMaterias() {
        return (mMaterias);
    }

    public void setNotas(float n1, float n2, float n3, float n4) {
        mNotas = new float[]{n1, n2, n3, n4};
    }

    public float[] getGrade() {
        return (mNotas);
    }

    @Override
    public String toString() {
        return "Nome do Aluno: " + mNomeAluno + ".\n" +
                "Disciplina: " + mMaterias[0] + "." + " Nota: " + mNotas[0] + ".\n" +
                "Disciplina: " + mMaterias[1] + "." + " Nota: " + mNotas[1] + ".\n" +
                "Disciplina: " + mMaterias[2] + "." + " Nota: " + mNotas[2] + ".\n" +
                "Disciplina: " + mMaterias[3] + "." + " Nota: " + mNotas[3] + ".\n";
    }
}
