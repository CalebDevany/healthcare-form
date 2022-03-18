import Head from 'next/head'
import styles from '../styles/Home.module.css'

export default function Home() {
  return (
    <div className={styles.container}>
      <Head>
        <title>Healthcare Provider Availity Join Form</title>
        <meta name="description" content="Form for Healthcare Providers to Join Availity" />
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <main className={styles.main}>
        <div class="max-w-xl mx-auto py-12 md:max-w-4xl">
          <div class="py-12">
            <h1 class="text-4xl font-bold">Healthcare Provider Info</h1>
          </div>

          <div class="mt-8 max-w-md">
            <div class="grid grid-cols-1 gap-6">
              <span class="text-gray-700">First Name</span>
              <input type="text" class="
                mt-0
                block
                w-full
                px-0.5
                border-0 border-b-2 border-gray-200
                focus:ring-0 focus:border-black" placeholder="First Name"></input>

              <span class="text-gray-700">Last Name</span>
              <input type="text" class="
                mt-0
                block
                w-full
                px-0.5
                border-0 border-b-2 border-gray-200
                focus:ring-0 focus:border-black" placeholder="Last Name"></input>

              <span class="text-gray-700">NPI Number</span>
              <input type="tel" class="
                mt-0
                block
                w-full
                px-0.5
                border-0 border-b-2 border-gray-200
                focus:ring-0 focus:border-black" placeholder="NPI Number"></input>

              <span class="text-gray-700">Business Address</span>
              <input type="text" class="
                mt-0
                block
                w-full
                px-0.5
                border-0 border-b-2 border-gray-200
                focus:ring-0 focus:border-black" placeholder="Business Address"></input>

              <span class="text-gray-700">Telephone Number</span>
              <input type="tel" class="
                mt-0
                block
                w-full
                px-0.5
                border-0 border-b-2 border-gray-200
                focus:ring-0 focus:border-black" placeholder="(123)456-7890"></input>

              <label class="block">
              <span class="text-gray-700">Email address</span>
              <input type="email" class="
                  mt-0
                  block
                  w-full
                  px-0.5
                  border-0 border-b-2 border-gray-200
                  focus:ring-0 focus:border-black" placeholder="johndoe@example.com"></input>
              </label>

            </div>
            <button class="mt-8 bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
              Submit
            </button>
          </div>
        </div>
      </main>

      <footer className={styles.footer}>
        
      </footer>
    </div>
  )
}
