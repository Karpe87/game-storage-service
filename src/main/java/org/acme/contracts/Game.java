package org.acme.contracts;

import java.util.UUID;
import java.util.List;

public record Game (UUID id, String name, Integer yearPublished) {

}
