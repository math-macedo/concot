dataSource {
    //indica se iremos usar um pool
    pooled = true
    /*indica que poderemos acompanhar o status da nossa fonte de dados a partir de um cliente
    JMX */
    jmxExport = true
    // Classe do nosso driver. 
    driverClassName = "org.postgresql.Driver"
    // Nome do usuário usado na obtenção de conexão com o banco de dados
    username = "postgres"
    // A senha usada durante a obtenção de de conexão com o bando de dados
    password = "968967"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//  cache.region.factory_class = 'org.hibernate.cache.SingletonEhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// definimos quais os ambientes de execução
environments {
    development { //desenvolvimento 
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:postgresql://localhost:5432/concot"
        }
    }
    test { //teste
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production { //produção
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/concot"
            properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               jmxEnabled = true
               initialSize = 5
               maxActive = 50
               minIdle = 5
               maxIdle = 25
               maxWait = 10000
               maxAge = 10 * 60000
               timeBetweenEvictionRunsMillis = 5000
               minEvictableIdleTimeMillis = 60000
               validationQuery = "SELECT 1"
               validationQueryTimeout = 3
               validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = false
               jdbcInterceptors = "ConnectionState"
               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }
}
