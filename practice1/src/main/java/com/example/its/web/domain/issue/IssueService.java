package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final com.example.its.domain.issue.IssueRepository issueRepository;

    public List<com.example.its.domain.issue.IssueEntity> findAll() {
        return issueRepository.findAll();
    }

    @Transactional
    public void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }

    public com.example.its.domain.issue.IssueEntity findById(long issueId) {
        return issueRepository.findById(issueId);
    }
}