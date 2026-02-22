package com.designvault.designvault.repository;

import com.designvault.designvault.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    List<Asset> findByCategoryIgnoreCase(String category);

}