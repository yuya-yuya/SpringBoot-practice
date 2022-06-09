package com.example.its.domain.issue;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    public List<com.example.its.domain.issue.IssueEntity> findAll() {
        return List.of(
                new com.example.its.domain.issue.IssueEntity(1, "概要1", "説明1"),
                new com.example.its.domain.issue.IssueEntity(2, "概要2", "説明2"),
                new com.example.its.domain.issue.IssueEntity(3, "概要3", "説明3")
        );
    }
}