package gr.codehub.mock.p06_argument_captor;

public interface PhoneRepository {
    void save(Phone phone);

    Phone findPhoneById(String phoneId);
}
