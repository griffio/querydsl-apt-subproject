package griffio.system;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SystemPart {

  private Long id;

  public SystemPart(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

}
