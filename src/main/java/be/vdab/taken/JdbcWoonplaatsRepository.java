package be.vdab.taken;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class JdbcWoonplaatsRepository extends AbstractRepository implements WoonplaatsRepository{

    @Override
    public List<String> findMetStreepjes() {
        List<String> woonplaatsen = new ArrayList<>();
        String sql = """
                select naam
                from woonplaatsen
                where naam like '%-%'
                """;
        try (var connection = super.getConnection(); var statement = connection.prepareStatement(sql)) {
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setAutoCommit(false);
            for (var result = statement.executeQuery(); result.next(); ) {
                woonplaatsen.add(result.getString("naam"));
            }
            connection.commit();
            return woonplaatsen;
        } catch (SQLException ex) {
            throw new RepositoryException(ex);
        }
    }
}
