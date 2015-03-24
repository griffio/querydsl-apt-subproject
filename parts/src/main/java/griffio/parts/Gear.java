package griffio.parts;

import griffio.system.SystemPart;

import javax.persistence.Entity;

@Entity
public class Gear extends SystemPart {
  public Gear(Long id) {
    super(id);
  }
}
