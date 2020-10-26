package com.thang.quiz.solution;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.thang.quiz.R;
import com.thang.quiz.SolutionActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class QuestionsFragment extends Fragment {

    @BindView(R.id.rv_questions)
    RecyclerView solutions;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_questions, container, false);

        ButterKnife.bind(this, view);

        QuestionsAdapter questionsAdapter = new QuestionsAdapter(SolutionActivity.getQuestion());
        solutions.setAdapter(questionsAdapter);

        return view;
    }
}