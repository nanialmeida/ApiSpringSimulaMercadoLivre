package com.mercadolivre.hernani.compra;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.Invocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.util.UriComponentsBuilder;

import com.mercadolivre.hernani.cadastroProduto.NovaCaracteristicaForm;
import com.mercadolivre.hernani.cadastroProduto.Produto;
import com.mercadolivre.hernani.cadastroProduto.ProdutoRepository;
import com.mercadolivre.hernani.cadastrocategoria.Categoria;
import com.mercadolivre.hernani.cadastrousuario.Usuario;

class CompraControllerTest {
 private EntityManager manager = new EntityManager() {
	
	@Override
	public <T> T unwrap(Class<T> cls) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setFlushMode(FlushModeType flushMode) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remove(Object entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void refresh(Object entity, LockModeType lockMode, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void refresh(Object entity, LockModeType lockMode) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void refresh(Object entity, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void refresh(Object entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void persist(Object entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public <T> T merge(T entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void lock(Object entity, LockModeType lockMode, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void lock(Object entity, LockModeType lockMode) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void joinTransaction() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isJoinedToTransaction() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public EntityTransaction getTransaction() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> T getReference(Class<T> entityClass, Object primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Metamodel getMetamodel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LockModeType getLockMode(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public FlushModeType getFlushMode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EntityManagerFactory getEntityManagerFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> entityClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EntityGraph<?> getEntityGraph(String graphName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object getDelegate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CriteriaBuilder getCriteriaBuilder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> T find(Class<T> entityClass, Object primaryKey, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> T find(Class<T> entityClass, Object primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void detach(Object entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public StoredProcedureQuery createStoredProcedureQuery(String procedureName, String... resultSetMappings) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public StoredProcedureQuery createStoredProcedureQuery(String procedureName, Class... resultClasses) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public StoredProcedureQuery createStoredProcedureQuery(String procedureName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> TypedQuery<T> createQuery(String qlString, Class<T> resultClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createQuery(CriteriaDelete deleteQuery) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createQuery(CriteriaUpdate updateQuery) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createQuery(String qlString) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createNativeQuery(String sqlString, String resultSetMapping) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createNativeQuery(String sqlString, Class resultClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createNativeQuery(String sqlString) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public StoredProcedureQuery createNamedStoredProcedureQuery(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> TypedQuery<T> createNamedQuery(String name, Class<T> resultClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Query createNamedQuery(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EntityGraph<?> createEntityGraph(String graphName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> EntityGraph<T> createEntityGraph(Class<T> rootType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean contains(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
};
	private UriComponentsBuilder uriComponentsBuilder;
	
	private Compra comprasendoSalva;

	@Test
	@DisplayName("redereciona para gateway se estoque e aceito")
	void test1() throws Exception {
		List<NovaCaracteristicaForm> caracteristicas = List.of(
				new NovaCaracteristicaForm("key","value"),
				new NovaCaracteristicaForm("key2","value2"),
				new NovaCaracteristicaForm("key3","value3"));
		Categoria categoria = new Categoria("categoria");
		Usuario dono = new Usuario("email@email.com", "123456");
		Produto produto = new Produto("teste", BigDecimal.TEN, 10, "descricao", categoria, dono, caracteristicas);
		Mockito.when(manager.find(Produto.class, 1l)).thenReturn(produto);
	    Mockito.doAnswer(invocation -> {
			comprasendoSalva = invocation.<Compra>getArgument(0);
			ReflectionTestUtils.setField(comprasendoSalva, "id", 1l);
			return null;
		}).when(manager).persist(Mockito.any(Compra.class));
		
		CompraForm request = new CompraForm(2, GatewayPagamento.pagseguro);
		String endereco = request.getGateway().criaUrlRetorno(comprasendoSalva, uriComponentsBuilder);
		
		Assertions.assertEquals("pagseguro.com/1?redirectUrl=http://localhost:8080/retorno-pagseguro/",endereco);
	}

}
