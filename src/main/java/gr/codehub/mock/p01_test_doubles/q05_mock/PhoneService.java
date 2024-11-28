package gr.codehub.mock.p01_test_doubles.q05_mock;

public class PhoneService {

    private final PhoneRepository phoneRepository;

    public PhoneService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public void addPhone(Phone phone) {
        if (phone.getPrice() > 500) {
            return;
        }
        phoneRepository.save(phone);
    }

}
