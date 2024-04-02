package ma.tp2.tp3rep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ma.tp2.tp3rep.entities.Patient;
import ma.tp2.tp3rep.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
/*import org.springframework.boot.SpringApplication;*/
/*import org.springframework.boot.autoconfigure.SpringBootApplication;*/

import java.util.Date;

@SpringBootApplication
public class Tp3RepApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(Tp3RepApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));


    }
}