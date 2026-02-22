package com.designvault.designvault.model;

import jakarta.persistence.*;

@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String projectName;
    private String category;
    private String description;
    private String filePath;

    public Asset() {
    }

    public Asset(String projectName, String category, String description, String filePath) {
        this.projectName = projectName;
        this.category = category;
        this.description = description;
        this.filePath = filePath;
    }

    public Long getId() { return id; }

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
}