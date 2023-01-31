Feature: Tes fungsionalitas login dan purchase

  Scenario: Tes login dan purchase berhasil
    Given buka browser untuk purchase
    And user berada di halaman login untuk purchase
    When user input username dan password untuk purchase
    And user klik tombol login untuk purchase
    Then user berada dihalaman beranda untuk purchase
    And user klik tombol add to chart
    And user klik ikon keranjang
    And user klik tombol checkout
    When user input nama depan nama belakang dan postal code
    And user klik tombol continue
    And user klik tombol finish
    Then user menyelesaikan pesanan
