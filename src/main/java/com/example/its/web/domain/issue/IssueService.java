package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final com.example.its.domain.issue.IssueRepository issueRepository;

    public List<com.example.its.domain.issue.IssueEntity> findAll() {
        return issueRepository.findAll();
    }

    // TODO トランザクション
    public void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }
}