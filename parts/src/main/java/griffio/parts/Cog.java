package griffio.parts;

import griffio.system.SystemPart;

import javax.persistence.Entity;

@Entity
public class Cog extends SystemPart {
  public Cog(Long id) {
    super(id);
  }
}
