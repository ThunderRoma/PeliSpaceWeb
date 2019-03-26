  <%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
	<script>
		window.userRole = '${userModel.rol}';
	</script>       
        <!-- RD Navbar-->
        <div class="rd-navbar-wrap rd-navbar-transparent">
          <nav data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-device-layout="rd-navbar-static" data-stick-up-clone="true" data-md-stick-up-offset="50px" data-lg-stick-up-offset="150px" class="rd-navbar">
            <div class="rd-navbar-inner">
              <!-- RD Navbar Panel-->
              <div class="rd-navbar-panel">
                <!-- RD Navbar Toggle-->
                <button data-rd-navbar-toggle=".rd-navbar-nav-wrap" class="rd-navbar-toggle"><span></span></button>
                <!-- RD Navbar Brand--><a href="${contextRoot}/" class="rd-navbar-brand"><img src="${images}/logo.png" alt="" width="40" height="20"/></a>
              </div>
              <div class="rd-navbar-nav-wrap">
                <!-- RD Navbar Nav-->
                <ul class="rd-navbar-nav navbar-left">
                  <li class="active" id="home"><a href="${contextRoot}/home">Home</a></li>
                  <li id="about"><a href="${contextRoot}/about">About</a></li>
                  <li id="contact"><a href="${contextRoot}/contact">Contact</a></li>
                  <li id="gallery"><a href="${contextRoot}/gallery">Gallery</a></li>
				</ul>
              </div>
            </div>
          </nav>
        </div>