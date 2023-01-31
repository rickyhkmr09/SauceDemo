Feature: Tes fungsionalitas login

  Scenario: Tes login berhasil
    Given buka browser
    And user berada di halaman login
    When user input username dan password
    And user klik tombol login
    Then user berada dihalaman beranda
