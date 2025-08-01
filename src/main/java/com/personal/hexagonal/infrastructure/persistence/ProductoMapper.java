package com.personal.hexagonal.infrastructure.persistence;

import com.personal.hexagonal.domain.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {
    
    /**
     * Convierte de entidad de dominio a entidad JPA
     * @param producto entidad de dominio
     * @return entidad JPA para persistencia
     */
    public ProductoEntity toEntity(Producto producto) {
        if (producto == null) {
            return null;
        }
        
        ProductoEntity entity = new ProductoEntity();
        entity.setId(producto.getId());
        entity.setNombre(producto.getNombre());
        entity.setDescripcion(producto.getDescripcion());
        entity.setPrecio(producto.getPrecio());
        entity.setStock(producto.getStock());
        entity.setCategoria(producto.getCategoria());
        entity.setFechaCreacion(producto.getFechaCreacion());
        entity.setFechaActualizacion(producto.getFechaActualizacion());
        entity.setActivo(producto.isActivo());
        
        return entity;
    }
    
    /**
     * Convierte de entidad JPA a entidad de dominio
     * @param entity entidad JPA
     * @return entidad de dominio
     */
    public Producto toDomain(ProductoEntity entity) {
        if (entity == null) {
            return null;
        }
        
        Producto producto = new Producto();
        producto.setId(entity.getId());
        producto.setNombre(entity.getNombre());
        producto.setDescripcion(entity.getDescripcion());
        producto.setPrecio(entity.getPrecio());
        producto.setStock(entity.getStock());
        producto.setCategoria(entity.getCategoria());
        producto.setFechaCreacion(entity.getFechaCreacion());
        producto.setFechaActualizacion(entity.getFechaActualizacion());
        producto.setActivo(entity.isActivo());
        
        return producto;
    }
}
