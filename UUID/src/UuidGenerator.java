import java.math.BigInteger;
import java.util.UUID;

public class UuidGenerator {
    private final String code;
    private String name;

    public UuidGenerator() {
        this.code = "t2_"+generateUUIDBase36();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UuidGenerator{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public String generateUUIDBase36() {
        // Step 1: Generate a UUID
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID: " + uuid);

        // Step 2: Convert the UUID to a string (hexadecimal representation without dashes)
        String uuidHex = uuid.toString().replace("-", "");

        // Step 3: Convert the hexadecimal string to a BigInteger
        BigInteger uuidBigInt = new BigInteger(uuidHex, 16);

        // Step 4: Convert the BigInteger to a Base36 string
        return uuidBigInt.toString(36);
    }
}
