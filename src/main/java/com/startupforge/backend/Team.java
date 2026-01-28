package com.startupforge.backend;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // These names match your HTML "data" object keys exactly
    private String teamName;
    private String repoLink;

    @Column(length = 1000) // IMPORTANT: Allows long descriptions (HTML limit is 500)
    private String description;

    private String pptUrl;
    private String submittedAt;

    public Team() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }
    public String getRepoLink() { return repoLink; }
    public void setRepoLink(String repoLink) { this.repoLink = repoLink; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPptUrl() { return pptUrl; }
    public void setPptUrl(String pptUrl) { this.pptUrl = pptUrl; }
    public String getSubmittedAt() { return submittedAt; }
    public void setSubmittedAt(String submittedAt) { this.submittedAt = submittedAt; }
}