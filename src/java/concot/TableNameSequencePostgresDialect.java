package concot;

import java.util.Properties;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.id.PersistentIdentifierGenerator;
import org.hibernate.id.SequenceGenerator;
import org.hibernate.type.Type;

/**
 *
 * @author joselei
 */
public class TableNameSequencePostgresDialect extends PostgreSQLDialect {

    @Override
    public Class<?> getNativeIdentifierGeneratorClass() {
        return TableNameSequenceGenerator.class;
    }
    
    public static class TableNameSequenceGenerator extends SequenceGenerator {

        @Override
        public void configure(final Type type, final Properties params, final Dialect dialect) {
            if (params.getProperty(SEQUENCE) == null || params.getProperty(SEQUENCE).length() == 0) {
                String tableName = params.getProperty(PersistentIdentifierGenerator.TABLE);
                if (tableName != null)
                    params.setProperty(SEQUENCE, tableName + "_id_seq");
            }
            super.configure(type, params, dialect);
        }
    }
}
