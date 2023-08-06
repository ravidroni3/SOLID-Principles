package I.Bad;

public class BadDaoConnection implements BadDAOInterface {

    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Open file not supported");

    }

    @Override
    public void deleteRecord() {

    }
}
