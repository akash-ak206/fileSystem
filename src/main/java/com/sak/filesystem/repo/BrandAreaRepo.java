package com.sak.filesystem.repo;

import com.sak.filesystem.data.BrandArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandAreaRepo extends JpaRepository<BrandArea, Long> {
}
