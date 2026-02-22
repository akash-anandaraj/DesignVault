package com.designvault.designvault.service;

import com.designvault.designvault.model.Asset;
import com.designvault.designvault.repository.AssetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository repository;

    public AssetService(AssetRepository repository) {
        this.repository = repository;
    }

    public Asset saveAsset(Asset asset) {
        return repository.save(asset);
    }

    public List<Asset> getAllAssets() {
        return repository.findAll();
    }

    public List<Asset> searchByCategory(String category) {
        return repository.findByCategoryIgnoreCase(category);
    }
}